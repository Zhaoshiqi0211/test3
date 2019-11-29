package zsq_test1;

//import org.apache.commons.math3.*; //调用apache组件
//import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum; 
import org.apache.commons.math3.stat.descriptive.moment.Variance;
//import java.lang.*;
public class part1
{
    //求一个数组中所有数的和
	public double sum(double[] array)
	{
		Sum s=new Sum();
		double sum=s.evaluate(array);
		return sum;
	}
	//求一个数组中所有数的平均和,同时声明有多少个非负数
	public double get_allmean(double[] array)
	{
		DescriptiveStatistics a=new DescriptiveStatistics();
		int flag_num=0;//用于记录非负数有多少个
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				flag_num++;
				a.addValue(array[i]);
			}
			else
			{
				a.addValue(array[i]);
				
			}
		}
		System.out.println("非负数的个数为："+flag_num);
		double mean=a.getMean();
		//System.out.println(mean);
		return mean;
	}
   //求数组中的最大值
   public double maxnum(double[] array)
   {
	   Max m=new Max();
	   double max=m.evaluate(array);
	   return  max;
   }
   //求数组中的最小值
   public double minnum(double[] array)
   {
	   Min m=new Min();
	   double min=m.evaluate(array);
	   return min;
   }
   //判断一个数组的方差与1的关系，小于返回真，否则返回假
   public boolean checkarray_variance(double[] array)
   {
	   Variance v=new Variance();
	   double variance=v.evaluate(array);
	   if(variance<1)
		   return true;
	   else
		   return false;
   }
    //求一个数组中奇数的和的平均值
   public double oddsum_mean(double[] array)
   {
	   DescriptiveStatistics a=new DescriptiveStatistics();
	   int i=0;
	   while(i!=array.length)
	   {
		   //if(array[i]%2==1)
		   if(array[i]%2!=0)//人为注入错误
		   {
			   a.addValue(array[i]);
			   i++;
		   }
		   else
		   {
			   i++;
		   }
	   }
	   double mean=a.getMean();
	   //System.out.println(mean);
	   return mean;
   }
   //求一个数组的极大值与极小值的差值
   public double getextrenum(double[] array)
   {
	   double max=maxnum(array);
	   double min=minnum(array);
	   double extrenum=max-min;
	   return extrenum;
   }
}

