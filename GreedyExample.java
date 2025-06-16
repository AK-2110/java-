package demo;

public class GreedyExample {
	static class Transport{
		String name;
		int time;
		int cost;
		Transport(String name,int time,int cost){
			this.name=name;
			this.time=time;
			this.cost=cost;
		}
	}
	public static void main(String[] args) {
		Transport[] options = {
				new Transport("fight",1,5000),
				new Transport("train",15,1000),
				new Transport("bus",30,500)
		};
		Transport best = options[0];
		for(int i=1;i<options.length;i++) {
			if(options[i].cost<best.cost) {
				best = options[i];
			}
		}
		System.out.println("Best options to reach fast to GOA");
		System.out.println(best.cost + " -cost :" + best.cost + "cost:" + best.cost);
	}

}
