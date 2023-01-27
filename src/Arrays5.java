//find maximun numbers in a given array
public class Arrays5
{
    public static void main(String[] args) {
        int arr[]={6,3,4,9,10,34,25,2};
        int ans = 0;
        for (int i = 0; i < arr.length; i++)
        {
          if (arr[i]>ans)
          {
            ans = arr[i];
          }
        }
        System.out.println("The maximum number in given array is "+ans);
    }
}
