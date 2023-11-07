import socket
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect(('127.0.0.1', 1234))
a = input("ARP or RARP: ")
if a == "ARP":
    add = input("Enter IP: ")
elif a == "RARP":
    add = input("Enter MAC: ")
else:
    print("Invalid option. Please choose 'ARP' or 'RARP'.")
    exit()
s.send(add.encode())
mac = s.recv(1024)
mac = mac.decode("utf-8")
if a == "ARP":
    print(f"MAC of {add} is: {mac}")
else:
    print(f"IP of {add} is: {mac}")