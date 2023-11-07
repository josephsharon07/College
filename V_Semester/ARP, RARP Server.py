import socket

table = {
    '192.168.1.11': '4A:4A:11',
    '192.168.2.1': '5E:51:48:01',
    '192.168.1.3': '48:35:CD:32',
    '192.168.4.1': 'AF:4D:1F:FF',
    '192.168.3.2': 'C3:C5:EE:C2',
}

s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind(('localhost', 1234))
s.listen(5)

while True:
    clientsocket, address = s.accept()
    print("Connection From", address, "Has Established")
    
    ip = clientsocket.recv(1024)
    ip = ip.decode("utf-8")
    
    mac = table.get(ip, 'No entry for the given address')
    clientsocket.send(mac.encode())
    clientsocket.close()