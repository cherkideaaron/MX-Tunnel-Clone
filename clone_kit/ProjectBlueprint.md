# Project Blueprint: VPN Tunnel Reconstruction

This document serves as the high-level technical blueprint and instruction set for an AI agent tasked with recreating the **MX-Tunnel** VPN proxy system in a fresh Android project.

---

## 1. Project Initialization
- Create a new Android project using **Kotlin** or **Java** (Java is easier to match the provided source).
- Set `minSdkVersion` to 21 (required for many `VpnService` features).
- Add the required permissions in `AndroidManifest.xml`:
    - `android.permission.INTERNET`
    - `android.permission.BIND_VPN_SERVICE`
    - `android.permission.ACCESS_NETWORK_STATE`

## 2. Core Components to Implement

### A. The VpnService (The Gateway)
- Inherit from `android.net.VpnService`. 
- Implementation Goal: Establish the TUN interface and route all device traffic (0.0.0.0/0) through it.
- **Critical Requirement**: Call `protect(socket)` on any socket that connects to the remote VPN server or local proxy to prevent an infinite loop.

### B. The Injector (Localized Traffic Interceptor)
- Port: `7878`
- Logic:
    1.  Listens for local connections from the VPN client (e.g., OpenVPN).
    2.  Reads the first request (usually an HTTP `CONNECT`).
    3.  Applies the **Payload** (header modification).
- **Ref**: `InjectorService.java` in the kit.

### C. The Stream Copier (Bidirectional Shoveler)
- Logic:
    1.  Read from Local Socket -> Write to Remote Socket.
    2.  Read from Remote Socket -> Write to Local Socket.
- **Hack Implementation**: In the Remote -> Local direction, if you see an HTTP status other than 200, replace it with `HTTP/1.1 200 OK\r\n\r\n`.
- **Ref**: `C3528vA.java` in the kit.

### D. The Payload Logic
- Use a placeholder replacement engine to handle tags like `[host]`, `[port]`, and `[crlf]`.
- Implement a **Split Payload** mechanism to thwart DPI. Split the payload string at `[split]` markers and send the parts with `Thread.sleep()`.

## 3. Step-by-Step AI Instructions

1.  **Phase 1**: Implement a simple `VpnService` that creates a TUN interface and forwards traffic to an external DNS to verify routing.
2.  **Phase 2**: Implement a basic TCP Proxy (`ServerSocket` on 7878) that forwards data without modification.
3.  **Phase 3**: Integrate the `Payload` logic. Use the `b()` and `g()` methods from `InjectorService.java` as a guide.
4.  **Phase 4**: Add the `200 OK` response spoofing to ensure the VPN client stays connected even when the ISP's Proxy/Firewall throws a challenge.
5.  **Phase 5**: Connect to an OpenVPN or Socks5 server as the backend.

---
*Blueprint generated for System Reconstruction - Antigravity AI*
