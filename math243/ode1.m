%function t=t(n,t0,t1,y0)
%UNTITLED Summary of this function goes here
%   Detailed explanation goes here

function yout=ode1(F,t0,h,tfinal,y0)
y=y0;
yout=y;
for t=t0 : h :tfinal-h
    s=F(t,y);
    y=y+h*s;
    yout=[yout;y];
end


