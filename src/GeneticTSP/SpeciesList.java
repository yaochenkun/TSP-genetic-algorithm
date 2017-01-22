package GeneticTSP;
public class SpeciesList 
{
	SpeciesNode head;//头结点
	int speciesNum;//物种数量
	
	SpeciesList()
	{
		head=new SpeciesNode();
		speciesNum=Constant.SPECIES_NUM;
	}
	
	//添加物种
	void add(SpeciesNode species)
	{
		SpeciesNode point=head;//游标
		while(point.next != null)//寻找表尾结点
			point=point.next;
		point.next=species;
	}
	
	//遍历
	void traverse()
	{
		SpeciesNode point=head.next;//游标
		while(point != null)//寻找表尾结点
		{
			for(int i=0;i<Constant.CITY_NUM;i++)
				System.out.print(point.genes[i]+" ");
			System.out.println(point.distance);
			point=point.next;
		}
		System.out.println("_______________________");
	}
}
