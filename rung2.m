F(t,y)=@ t.^2*sin(10-y);
t0=0;
tfinal=5;
h=0.1;
y0=0;
rung(F,t0,h,tfinal,y0);
%%plot
t2=(0:h:tfinal)';
plot(t,y,'.');