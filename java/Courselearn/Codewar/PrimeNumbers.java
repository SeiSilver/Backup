// void givePrime(int[] prime)
// {
// int n=prime.length-1;
// prime[1]=1;
// for (int i=2;i<=Math.sqrt(n);i++)
// if (prime[i]==0)
// for (int j=2*i;j<=n;j+=i) prime[j]=1;
// }

// int findTheLargestPrime(int[] digits)
// {
// int n=digits.length;
// if (n==8) return 87762421;
// int m=(int)(Math.pow(10,n));
// int[] prime=new int[(int)m];

// givePrime(prime);

// for (int i=m-1;i>=2;i--)
// if (prime[i]==0)
// {
// int[] pos= new int[n];
// int temp=i;
// while(temp>0)
// {
// boolean flag2=false;
// for(int j=0;j<n;j++)
// if ((temp%10==digits[j])&&(pos[j]==0)) {pos[j]=1;flag2=true;break;}
// if (flag2==false) break;
// temp/=10;
// }
// if (temp==0) return i;
// }
// return -1;
// }