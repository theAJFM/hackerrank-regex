import re

def main():
    testcase = int(raw_input())
    db = {}
    form = re.compile(".*<(\w+)")
    formatt = re.compile("(\w+)=")
    for i in range(testcase):
        temp = raw_input()
        arr = re.split(" |>", temp)
        for j in arr:
            if(form.match(j)):
                m = form.match(j)
                if(m.group(1) not in db):
                    db[m.group(1)] = []
            elif(formatt.match(j)):
                n = formatt.match(j)
                if(n.group(1) not in db[m.group(1)]):
                    db[m.group(1)].append(n.group(1))
    
    for x in sorted(db.iterkeys()):
        out = x+":"
        db[x].sort()
        for y in db[x]:
            out += y+","
        if(out != x + ":"):
            out = out[:-1]
        print(out)
            
main()
