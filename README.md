
# Java Client-Server Messaging System 📡

## 📝 Overview

This is a simple **Client-Server Messaging System** built using Java Sockets. It enables two-way communication between a server and a client over a TCP/IP network using the console.



## 🎯 Features

- Basic real-time messaging between client and server.
- Console-based chat interface.
- Graceful shutdown using the command `exit` by either client or server.
- Lightweight and easy to understand.

---

## 🧩 Project Structure

```
/client-server-java
├── Server.java   # Handles client connection and messaging
└── Client.java   # Connects to server and sends/receives messages
```

---

## 🛠️ Technologies Used

- **Java SE**
- **Socket Programming** (Java Sockets)
- **Input/Output Streams** (BufferedReader, PrintWriter)

---

## 🚀 How to Run the Project

### 1️⃣ Compile both classes:
```bash
javac Server.java
javac Client.java
```

### 2️⃣ Start the Server (in one terminal):
```bash
java Server
```

### 3️⃣ Start the Client (in another terminal):
```bash
java Client
```

---

## 💬 How it Works

1. The **server** listens on port `5000` and waits for a client connection.
2. The **client** connects to the server using localhost (127.0.0.1) and the same port.
3. Both client and server can send messages to each other interactively.
4. Either side can type `exit` to close the chat session gracefully.

---

## 🖥️ Example Interaction

```
# Server Terminal:
Server is running... Waiting for client connection.
Client connected!
Client: Hello, Server!
Server: Hi Client, how are you?

# Client Terminal:
Connected to the server!
Client: Hello, Server!
Server: Hi Client, how are you?
```

---

## 📌 Notes

- Single client connection (1-to-1 chat).
- Uses port **5000** (can be modified in the code).
- The project is purely console-based (no GUI).

---

## 🚀 Possible Future Enhancements

- Multi-client chatroom (multi-threaded server).
- Message encryption (SSL sockets).
- Implement GUI using JavaFX or Swing.

---
