import socket

server = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_address = ("localhost", 10000)

server.bind(server_address)

server.listen(1)

print("Waiting for a connection")

connection, client_address = server.accept()

print("Connection established with", client_address)

while True:
    message = connection.recv(1000).decode()

    if message == "end":
        break

    if message:
        print("Received:", message)
        response = input("Enter a response: ")
        connection.sendall(response.encode())
    else:
        break

connection.close()
server.close()
