package com.testking.SelInterview;

import org.testng.annotations.Test;

public class loop_testing {
	

	
	@Test
	public boolean only14(){
		int[] nums={1,4,1,4};
		int count = 0;
		
		for (int i = 0;i<nums.length;i++)
		{
			if (nums[i]==1 || nums[i] ==4)
			{
				count++;
			}
		}
		if (count == nums.length)
		{
			return true;
		}
		return false;
		
		
	}
}


