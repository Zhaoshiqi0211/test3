package zsq_test1;

//import org.apache.commons.math3.*; //����apache���
//import org.apache.commons.math3.stat.Frequency;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import org.apache.commons.math3.stat.descriptive.rank.Max;
import org.apache.commons.math3.stat.descriptive.rank.Min;
import org.apache.commons.math3.stat.descriptive.summary.Sum; 
import org.apache.commons.math3.stat.descriptive.moment.Variance;
//import java.lang.*;
public class part1
{
    //��һ���������������ĺ�
	public double sum(double[] array)
	{
		Sum s=new Sum();
		double sum=s.evaluate(array);
		return sum;
	}
	//��һ����������������ƽ����,ͬʱ�����ж��ٸ��Ǹ���
	public double get_allmean(double[] array)
	{
		DescriptiveStatistics a=new DescriptiveStatistics();
		int flag_num=0;//���ڼ�¼�Ǹ����ж��ٸ�
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
		System.out.println("�Ǹ����ĸ���Ϊ��"+flag_num);
		double mean=a.getMean();
		//System.out.println(mean);
		return mean;
	}
   //�������е����ֵ
   public double maxnum(double[] array)
   {
	   Max m=new Max();
	   double max=m.evaluate(array);
	   return  max;
   }
   //�������е���Сֵ
   public double minnum(double[] array)
   {
	   Min m=new Min();
	   double min=m.evaluate(array);
	   return min;
   }
   //�ж�һ������ķ�����1�Ĺ�ϵ��С�ڷ����棬���򷵻ؼ�
   public boolean checkarray_variance(double[] array)
   {
	   Variance v=new Variance();
	   double variance=v.evaluate(array);
	   if(variance<1)
		   return true;
	   else
		   return false;
   }
    //��һ�������������ĺ͵�ƽ��ֵ
   public double oddsum_mean(double[] array)
   {
	   DescriptiveStatistics a=new DescriptiveStatistics();
	   int i=0;
	   while(i!=array.length)
	   {
		   //if(array[i]%2==1)
		   if(array[i]%2!=0)//��Ϊע�����
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
   //��һ������ļ���ֵ�뼫Сֵ�Ĳ�ֵ
   public double getextrenum(double[] array)
   {
	   double max=maxnum(array);
	   double min=minnum(array);
	   double extrenum=max-min;
	   return extrenum;
   }
}

