function yout=ode2(F,t0,h,tfinal,y0)
y=y0;
yout=y;
for t = t0 : h : tfinal-h
    s1=F(t,y);
    s2=F(t+h/2, y+h*s1/2);
    y=y+h*s2;
    yout = [yout; y0];
end

