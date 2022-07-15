public Class MinMaxObj {
public static void main(string[] args){
int [] input={56,34,7,3,54,3,34,34,53};
client clientObj= new client(Integer.Max_Value,integer.Min_value);
client unb=clientobj.min_max(input);
}
}
class Client{
int max;
int min;
public client(int min,int max){
this.min=min;
this.max=max;
}
public int getMax() {
return max;
}
public int getMin() {
return min;
}
client min_max(int[] arr){
for(int i=0;i<arr.length;i++){
if (arr[i]>max){
max=arr[i];
}
if(arr[i]<min) {
min=arr[i];
}
}
client ret_obj= new client(min,max);
return ret_obj;
}
@override
public String toString(){
return min+" "+max;
}
}
