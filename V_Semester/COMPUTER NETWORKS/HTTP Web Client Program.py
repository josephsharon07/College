import socket

# Create a socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

# Connect to the server
s.connect(("www.example.com", 80))

# Prepare and send the HTTP request
request = b"GET / HTTP/1.1\r\nHost:www.example.com\r\n\r\n"
s.sendall(request)

# Receive and print the response
response = s.recv(4096)
print(response.decode('utf-8'))

# Close the socket
s.close()
