char d[100]= "13287";
char s[100],a[100];
int main() {
    int swap,n;
    for (int i=0; i<=n; i++) s[i]=d[i];
    for (int i=0; i<=(n-1); i++) {
        for (int j=i+1; j<=n; j++) {
            if (s[i]>s[j]) {
                swap=s[i];
                s[i]=s[j];
                s[j]=swap;
                }
        }
        for (int c=0;c<=n;c++) a[c]=i;
    }
    printf("Value in ascending order\n");
    for (int i=0; i<=n; i++) {
        printf("d[%d]= %d\n", a[i],s[i]); 
        printf("%d",a[i]);
        }
    system("pause");
}