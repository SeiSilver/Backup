// int indexCount=0;
// void getRoad(String[] cityName,int[] road,String s)
// {
// int n=cityName.length;
// int temp=s.length();
// int pos=0;
// for (int i=0;i<temp;i++) if (s.charAt(i)==';') {pos=i; break;}

// String begin=s.substring(0,pos);
// String end=s.substring(pos+1,temp);
// int posA=0,posB=0;
// for(int i=0;i<n;i++)
// {
// if (cityName[i].equals(begin)) posA=i;
// else if (cityName[i].equals(end)) posB=i;
// }

// for(int i=0;i<n;i++)
// {
// if ((road[posA]==0)&&(road[posB]==0)) {
// indexCount++;
// road[posA]=indexCount;
// road[posB]=indexCount;
// }
// else if ((road[posA]==0)||(road[posB]==0)){
// int tmp=Math.max(road[posA],road[posB]);
// road[posA]=tmp;
// road[posB]=tmp;
// }
// else{
// int tmp1=Math.max(road[posA],road[posB]);
// int tmp2=Math.min(road[posA],road[posB]);
// for (int j=0;j<n;j++)
// if (road[j]==tmp1) road[j]=tmp2;
// }
// }
// }
// void getInput(int index,String[] cityName,int[] price,String s)
// {
// int n=s.length();
// int pos=0;
// for (int i=0;i<n;i++) if (s.charAt(i)==';') {pos=i; break;}
// cityName[index]=s.substring(0,pos);
// price[index]=Integer.parseInt(s.substring(pos+1,n));
// }

// int cinemasBuildingCost(String[] citiesList, String[] roads)
// {
// int n=citiesList.length;
// int m=roads.length;
// int result=0;
// String[] cityName=new String[n];
// int[] price=new int[n];
// int[] road=new int[n];
// int[] minResult=new int[n];
// for (int i=0;i<n;i++) getInput(i,cityName,price,citiesList[i]);
// if (m==0)
// {
// for(int i=0;i<n;i++) result+=price[i];
// return result;
// }
// for (int i=0;i<m;i++) getRoad(cityName,road,roads[i]);

// for (int i=0;i<n;i++) minResult[road[i]]=Integer.MAX_VALUE;

// for (int i=0;i<n;i++)
// minResult[road[i]]=Math.min(minResult[road[i]],price[i]);

// for (int i=0;i<indexCount;i++) result+=minResult[i+1];

// for (int i=0;i<n;i++)
// if (road[i]==0) result+=price[i];

// return result;
// }
