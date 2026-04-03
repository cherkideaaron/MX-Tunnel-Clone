# The Story of a Packet: MX-Tunnel's Great Escape

This is the detailed lifecycle of a single network request, from the moment you tap **"Connect"** to the moment your phone receives a response, bypassing the ISP firewall along the way.

---

## Chapter 1: The Ignition (The "Connect" Tap)
The moment you hit that big button, the app springs to life.
1. **Configuration Loading**: The app first talks to `C3492ub.java` (the configuration manager). It reads your selected server, payload tweaks, and ports. If the config is encrypted, it calls `PUtils.java`, which uses a secret native library to decrypt your `server.dat` list.
2. **Service Startup**: The `OpenVPNService.java` or `TunnelVpnService.java` starts up. These are the "brains" of the operation.
3. **The Local Buffer**: Simultaneously, `InjectorService.java` starts its `run()` method. It creates a "Local Proxy"—a private listening post at `127.0.0.1:7878` inside your phone. This is where the magic happens.

## Chapter 2: The Snare (Capturing Your Traffic)
Android creates a **TUN Interface** (a virtual network card).
- When you open Chrome and type `google.com`, the phone doesn't send the request to the cell tower yet. Instead, it sends it directly into the TUN interface managed by the app.
- The app uses a component like `Tun2Socks` (found in `PsiphonTunnel.java`) to take those raw IP packets and "bridge" them into our local proxy at `127.0.0.1:7878`.

## Chapter 3: The Disguise (The Injector's Work)
Your request for `google.com` is now sitting inside `InjectorService.java`. The `g()` function (the "Gatekeeper") intercepts it.
1. **Payload Crafting**: The app calls the `d()` function. It takes a "Payload Template" (e.g., `CONNECT [host_port] HTTP/1.1[crlf]Host: m.whitelisted-isp-site.com[crlf]`) and replaces the tags.
2. **The Forgery**: Your real destination (`google.com`) is hidden, and the packet is "dressed up" to look like it's going to a free, whitelisted site that your ISP ignores (like the operator's own portal).
3. **The Sniper Shot (SNI Spoofing)**: If it's an HTTPS request, the `e()` function kicks in. It modifies the "Client Hello" (the first handshake) to put a fake whitelisted domain in the SNI field. To the firewall, this looks like you're just browsing the operator's free site.

## Chapter 4: The Great Evasion (Bypassing DPI)
Smart firewalls use **Deep Packet Inspection (DPI)** to look deep inside packets. `InjectorService.java` has a trick for this:
- **`b()` and `c()` (Split & Delay)**: Instead of sending the "forged" header in one go, the `c()` function splits it into tiny pieces and uses `Thread.sleep(1500L)` to send them separately. 
- **The Result**: The firewall's brain gets confused. It sees a piece of a whitelisted domain, then a delay, then some random data. It fails to reassemble the "illegal" signatures and concludes, *"This looks like a slow, legal request to the operator's portal. Let it pass."*

## Chapter 5: The Journey (The Tunnel)
The modified request is now encrypted and "shoved" through the tunnel engine—be it Psiphon (`PsiphonTunnel.java`), Xray (`XRayDNSService.java`), or OpenVPN.
- This engine acts as a high-speed, invisible highway that carries your disguised packet across the ISP's network, through the cell tower (the "Base Station"), and into the open internet until it reaches your **Remote VPS Server**.

## Chapter 6: The Remote Hub (Server-Side Magic)
Your VPS server is waiting. It's running software like Squid or Stunnel.
1. **Unmasking**: The server receives the packet. It sees the fake whitelisted headers and strips them off.
2. **Fulfillment**: It looks at the *real* request hidden inside (your request for `google.com`) and goes out to the real internet to fetch the data.
3. **Packaging**: The internet responds to the server with the real website data. The server then encrypts this data and prepares it to send back to your phone.

## Chapter 7: The Return Trip (The 200 OK Trick)
The response travels back the same way. But there's a problem: sometimes the ISP's firewall realizes it was tricked and tries to redirect your connection to a "Buy More Data" page or sends a `404/400` error.
- **The "Hero" Component (`C3528vA.java`)**: As the data comes back into your phone's local proxy, this class inspects the response status. 
- **The Lie**: Even if the ISP sent a `404 Not Found` or a `302 Redirect` (to kill your connection), this function **deletes that error** and replaces it with a fake `HTTP/1.1 200 OK`. 
- **The Final Delivery**: The local VPN app receives this "200 OK", thinks the connection is healthy, and successfully delivers the real `google.com` data to your browser. Your phone is happy, Chrome loads the page, and the ISP thinks you just visited their free portal for a split second.

---
*Story crafted by Antigravity AI to explain the MX-Tunnel Pipeline*
