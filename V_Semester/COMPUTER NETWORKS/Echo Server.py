import socket

import sys

server_socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_address = ("localhost", 10000)

server_socket.bind(server_address)

server_socket.listen(1)

print("Waiting for a connection")

connection, client_address = server_socket.accept()

print("Connection established:", client_address)

data = connection.recv(1000)

print("Received:", data.decode())

connection.sendall(data)

connection.close()

server_socket.close()
