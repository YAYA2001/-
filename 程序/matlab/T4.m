X=xlsread('E:\ѧУ\Ժ��ѧϰ\���ˮ��ѧ\����\src\main\resources\T4');
h1=histogram(X,40,'Edgecolor','r','FaceColor',[0.6350 0.0780 0.1840],'Normalization','pdf')
hold on
a=[0:1:50];
y=exp(-log(a).*log(a)/2)./(sqrt(2*pi).*a);
plot(a,y,'color','b');