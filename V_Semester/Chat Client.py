import socket

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_address = ("localhost", 10000)

client.connect(server_address)

print("Connecting to port", server_address)

while True:
    message = input("Enter a message: ")
    client.sendall(message.encode())

    if message == 'end':
        break

    data = client.recv(1000).decode()
    if data:
        print("Received:", data)
    else:
        break

client.close()
