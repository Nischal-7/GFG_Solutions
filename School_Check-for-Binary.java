// https://practice.geeksforgeeks.org/problems/check-for-binary/0


class GfG
{
	boolean isBinary(String str)
	{
	  char []arr = str.toCharArray();
	  for(int i = 0; i<arr.length; i++)
	  {
	      if(!(arr[i]=='0'||arr[i]=='1'))
	        return false;
	  }
	  return true;
	}
}
