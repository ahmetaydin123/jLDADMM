package utility;

import org.kohsuke.args4j.Option;

public class CmdArgs
{

	@Option(name = "-model", usage = "Specify model", required = true)
	public String model = "";

	@Option(name = "-corpuspath", usage = "Specify path to topic modeling corpus")
	public String corpuspath = "";

	@Option(name = "-ntopics", usage = "Specify number of topics")
	public int ntopics = 20;

	@Option(name = "-alpha", usage = "Specify alpha")
	public double alpha = 0.1;

	@Option(name = "-beta", usage = "Specify beta")
	public double beta = 0.01;

	@Option(name = "-niters", usage = "Specify number of iterations")
	public int niters = 2000;

	@Option(name = "-twords", usage = "Specify number of top topical words")
	public int twords = 20;

	@Option(name = "-name", usage = "Specify a name to topic modeling experiment")
	public String expModelName = "model";

	@Option(name = "-seed", usage = "Specify a random seed for reproducibility")
	public int seed = 0;

	@Option(name = "-initFile")
	public String initTopicAssgns = "";

	@Option(name = "-sstep")
	public int savestep = 0;

	@Option(name = "-dir")
	public String dir = "";

	@Option(name = "-label")
	public String labelFile = "";

	@Option(name = "-prob")
	public String prob = "";

	@Option(name = "-paras", usage = "Specify path to hyper-parameter file")
	public String paras = "";

	@Option(name = "-collection", required = true, usage = "Collection")
	public Collection collection;

}
