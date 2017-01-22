package GeneticTSP;

public class Main 
{
	public static void main(String[] args) 
	{
		//创建遗传算法驱动对象
		GeneticAlgorithm GA=new GeneticAlgorithm();
		
		//创建初始种群
		SpeciesList speciesList=new SpeciesList();

		//开始遗传算法（选择算子、交叉算子、变异算子）
		SpeciesNode bestRate=GA.run(speciesList);

		//打印路径与最短距离
		bestRate.printRate();
	}
}
