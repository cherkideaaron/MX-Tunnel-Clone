# VPN Bypass System: Clone Kit README

This kit contains the core logic extracted from the **MX-Tunnel** Android application. Use these files and instructions to recreate the traffic interception and payload injection mechanism in a new project.

## 📂 Included Files & Roles

| File | Role | Key Functionality |
| :--- | :--- | :--- |
| `InjectorService.java` | **Core Interceptor** | Listens on port 7878; handles Payload Injection and placeholder replacement (`[host]`, `[port]`). |
| `C3528vA.java` | **Stream Shoveler** | Bidirectional data transfer between local client and remote server. Includes a "200 OK" spoofing hack. |
| `C3492ub.java` | **Settings Manager** | Wrapper for `SharedPreferences`. Stores payloads, proxy settings, and server credentials. |
| `OpenVPNService.java` | **Tunnel Integration** | Integrates with the OpenVPN 3 native library. Routes TUN traffic to the local proxy. |
| `TunnelVpnManager.java` | **Lifecycle Manager** | Manages the starting/stopping of the tunnel thread and TUN interface setup. |

---

## 🏗️ Architectural Flow

1.  **Packet Capture**: The Android `VpnService` establishes a Virtual Network Interface (TUN). All system traffic is routed into this interface.
2.  **Traffic Routing**: The captured packets are then forwarded to the **Local Proxy** running in `InjectorService` (default port `7878`).
3.  **Header Injection**:
    - The `InjectorService` reads the incoming request (e.g., a `CONNECT` request from the VPN client).
    - it wraps the request using a **Payload Template**.
    - *Example Payload*: `GET / HTTP/1.1[crlf]Host: [host][crlf]Connection: Keep-Alive[crlf][crlf]`
4.  **DPI Bypass**: The `c()` method in `InjectorService` splits the payload and introduces delays (e.g., `Thread.sleep(1500)`). This prevents Deep Packet Inspection (DPI) from seeing the "illegal" tunnel headers.
5.  **Tunneling**: The modified request is sent to the remote VPN server. The server decapsulates the packet and fulfills the original request.
6.  **Response Spoofing**: `C3528vA` detects if the server returns an error (like a 403 or 302 redirect from the ISP) and forces it to a `200 Connection Established` to keep the VPN tunnel alive.

---

## 🛠️ Placeholder Cheat Sheet

The decompiled code uses several tags in the "Payload" strings. Here is what they represent:

- `[host]`: Target server domain (e.g., `google.com`).
- `[port]`: Target server port (e.g., `443`).
- `[method]`: HTTP Method (`CONNECT`, `GET`, `POST`).
- `[protocol]`: HTTP version (`HTTP/1.1`).
- `[crlf]`: Carriage Return + Line Feed (`\r\n`).
- `[instant_split]`: A marker to split the packet immediately.
- `[delay_split]`: A marker to split the packet and wait before sending the next part.

---

## 🚀 Instructions for the AI Agent

1.  **Setup VpnService**: Inherit from `VpnService` and implement `onStartCommand` to configure the TUN interface.
2.  **Launch Injector**: Start a background thread running a `ServerSocket` on port `7878`.
3.  **Implement Handshake**: Use the logic in `InjectorService.g()` to parse incoming requests and `InjectorService.b()` to apply the payload injection.
4.  **Data Shoveling**: Use two threads (based on `C3528vA`) to copy the `InputStream` of the local socket to the `OutputStream` of the remote socket, and vice versa.
5.  **Native Integration**: If using OpenVPN, ensure you call `protect(socket)` on the proxy's outgoing socket so it doesn't loop back into the VPN.

---
*Created for Project Reconstruction - Antigravity AI*
