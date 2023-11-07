import socket

dns_table = {
    "www.google.com": "192.168.0.1",
    "www.wikipedia.org": "192.168.0.2",
    "www.python.org": "192.168.0.3",
    "www.aurcc.ac.in": "192.168.0.4",
    "www.amazon.in": "192.168.0.5",
    "www.tamilrockers.ta": "192.168.1.3",
}

s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
print("Starting Server...")
s.bind(("127.0.0.1", 1234))

while True:
    data, address = s.recvfrom(1024)
    print(f"{address} wants to fetch data!")
    data = data.decode()
    ip = dns_table.get(data, "Not Found!").encode()
    send = s.sendto(ip, address)

s.close()
