# TSP-GeneticAlgorithm
An implementation of TSP(Traveling Salesman Problem) by Genetic Algorithm in Java.
## Details
* Solve TSP in Java.
* Adopt Object-Oriented.
* Divide into 4 Classes: __GeneticAlgorithm__, __SpeciesNode__, __SpeciesList__ and __Constant__.
* Verify respectively in 3 different size of cities: 10 cities, 20 cities and 31 cities.

## Classes
* __GeneticAlgorithm__: controls the whole algorithm's life cycle and do some genetic operation including select, cross, mutate.
* __SpeciesNode__: contains the sequence of gene, the length of route and fitness of this species.
* __SpeciesList__: represents a list(group) of species(__SpeciesNode__)
* __Constant__: contains the data of map, the max length of every group of species, the max number of generations, the probability of cross, mutate and so on.

## For More
If you want to learn more information about this implementation, please visit the following three sites(but a pity only in Chinese):
* [use Genetic Algorithm to solve TSP(1)-Summary](http://yaochenkun.cn/index.php/2016/12/03/gene_article/)
* [use Genetic Algorithm to solve TSP(2)-Genetic Operations](http://yaochenkun.cn/index.php/2016/12/04/gene2_article/)
* [use Genetic Algorithm to solve TSP(3)-Verification](http://yaochenkun.cn/index.php/2016/12/05/generesult_article/)
