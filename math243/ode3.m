function yout = ode3(F,t0,h,tfinal,y0)
y=y0;
yout=y;
for t= t0 : h :tfinal-h
    s1=F(t,y);
    s2=F(t+h/2, y+h*s1/2);
    s3= F(t+h/2, y+h*s2/2);
    s4=F(t+h,y+h*s3);
    y=y + h*(s1 + 2*s2 + 2*s3 +s4)/6;
    yout = [yout; y];
end

%%t=(0:h:tfinal)'
%%plot(t,y,'.')