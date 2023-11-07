import socket

import sys

client = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

server_address = ("localhost", 10000)

client.connect(server_address)

message = input()

print("Sending", message)

client.sendall(message.encode())

print("ORIGINAL:", message)

data = client.recv(1000).decode()

print("ECHO:", data)

client.close()
