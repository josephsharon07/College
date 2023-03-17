import pandas
import urllib.request
url = "http://textfiles.com/adventure/aencounter.txt"
file = urllib.request.urlopen(url)
for line in file:
    decode_line=line.decode("utf-8")
    print(decode_line)