# MX Tunnel Pro: Technical Analysis and Workings

This document summarizes the internal workings of the MX Tunnel Pro VPN app, focusing on how it achieves a "zero-balance" (zero-rating) bypass to provide free internet access.

## 1. Overview and Core Flow
The app uses a layered approach to tunnel traffic. It fundamentally wraps **OpenVPN** and uses a local proxy chain to modify packets before they leave the device.

**The Proxy Chain:**
1. **VPN Client (OpenVPNService)** captures traffic.
2. It connects to a **Local Proxy** (`127.0.0.1:7878`).
3. The **InjectorService** modifies the traffic (adding spoofed headers).
4. The modified traffic is sent to the **Remote Server**.
5. The remote server strips the spoofed headers and fulfills the request.

---

## 2. Core Components and Key Files

### [OpenVPNService.java](file:///c:/Secret%20Projects/MX-Tunnel-Clone/app/src/main/java/rased/vpn/app/service/OpenVPNService.java)
The central orchestrator for VPN connectivity.
- **Native Integration:** Uses `net.openvpn.ovpn3.ClientAPI_OpenVPNClient` via JNI for the core OpenVPN protocol.
- **Key Methods:**
    - `o()`: Parses `.ovpn` profiles.
    - `handleMessage()`: Manages the connection state machine.
    - `h()`: Tracks real-time traffic statistics.

### [InjectorService.java](file:///c:/Secret%20Projects/MX-Tunnel-Clone/app/src/main/java/rased/vpn/app/service/InjectorService.java)
The "Payload Injector" and local proxy server.
- **`run()`**: Starts a `ServerSocket` on port **7878**.
- **`g()`**: The main interception/routing logic. It decides how to modify traffic based on the chosen mode (Direct, SSL/SNI, etc.).
- **`e()`**: Handles **SNI (Server Name Indication) Spoofing**. It modifies the TLS Client Hello to request a whitelisted domain, bypassing TLS-level firewalls.
- **`b(String str, Socket socket)`**: The primary injector. It applies custom HTTP payloads and uses techniques like `[split]` or `[delay_split]` (with `Thread.sleep(1500L)`) to evade **Deep Packet Inspection (DPI)**.
- **`d()` / `h()` / `a()`**: Helper methods that parse payload templates and replace placeholders like `[host]` or `[crlf]` with actual values.

### [C3492ub.java](file:///c:/Secret%20Projects/MX-Tunnel-Clone/app/src/main/java/defpackage/C3492ub.java)
The configuration manager that stores and retrieves user settings (payloads, servers, ports) from Android's `SharedPreferences`.

---

## 3. The "Zero-Balance" Bypass Mechanism
The app tricks the ISP's billing system by disguising VPN traffic as zero-rated data (e.g., traffic to an operator's portal, WhatsApp, or Google).

### Payload Injection & SNI Spoofing
- **Default SNI Clue:** Found in `res/values/strings.xml`: `CONNECT [host_port] [protocol][crlf]Host: m.google.com[crlf][crlf]`.
- **Logic:** By using whitelisted domains (like `m.google.com`) in the headers, the firewall allows the connection.

### Status Code Tricking (`vA.java` / `C3528vA.java`)
This class acts as a data relay bridge. If the ISP's proxy detects the spoofing and returns an error (e.g., `302 Redirect` or `400 Bad Request`), the client:
1. Intercepts the failure.
2. Strips the ISP's response.
3. **Injects a fake `HTTP/1.1 200 OK`** back to the internal VPN client.
4. This forces the VPN to proceed, pushing raw data through the socket while the ISP firewall is still "deciding" what to do with the connection.

---

## 4. Security, Assets, and Obfuscation
To protect the bypass methods from being easily found by ISPs, the app uses several layers of protection:

### Encrypted Configurations
- **Assets:** Working payloads and server lists are stored in `assets/gremlin.json` and `assets/server.psi`.
- **Decryption:** These are Base64/AES-CBC encrypted.
- **The Key:** The app derives its decryption key via PBKDF2 using a specific quote from **George Orwell's 1984** as a passphrase (found in `defpackage.H2.java`).

### Native Libraries
Crucial logic and decryption keys are often hidden in native library binaries to prevent easy extraction via Java decompilers.

---

## 5. Server-Side Requirements
The remote server is not "just a VPN." It must run proxy software (like Squid, Stunnel, or a custom script) that knows how to:
1. Accept the incoming spoofed headers.
2. Strip them off to reveal the true destination.
3. Route the traffic while maintaining the persistent connection "tunnel" established by the client.

---
*Analysis completed and organized by AI Assistant*