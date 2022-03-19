X=xlsread('E:\学校\院内学习\随机水文学\程序\src\main\resources\T2.xlsx');

h1=histogram(X,40,'Edgecolor','r','FaceColor',[0.6350 0.0780 0.1840],'Normalization','pdf')
hold on
a=-5:0.1:5;
y=exp(-a.*a/2)/sqrt(2*pi);
plot(a,y,'color','b');


