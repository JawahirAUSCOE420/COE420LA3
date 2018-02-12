for(i=1:1000)
    s(i)=oneovern(10*i)
end
x=100:100:1000*100
for(i=1:1000)
    h(i)=oneovernsq(10*i)
end
plot(x,s,x,h)
