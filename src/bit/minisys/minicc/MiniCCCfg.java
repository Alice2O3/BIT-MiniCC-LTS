package bit.minisys.minicc;

import bit.minisys.minicc.icgen.internal.IRBuilder;

public class MiniCCCfg {
	// input and output for MiniCCPreProcessor
	public static String MINICC_PP_INPUT_EXT = ".c";
	public static String MINICC_PP_OUTPUT_EXT = ".pp.c";
	// input and output for MiniCCScanner
	public static String MINICC_SCANNER_INPUT_EXT = ".pp.c";
	public static String MINICC_SCANNER_OUTPUT_EXT = ".tokens";
	// input and output for MiniCCParser
	public static String MINICC_PARSER_INPUT_EXT = ".tokens";
	public static String MINICC_PARSER_OUTPUT_EXT = ".ast.json";
	// input and output for MiniCCSemantic
	public static String MINICC_SEMANTIC_INPUT_EXT = ".tree";
	public static String MINICC_SEMANTIC_OUTPUT_EXT = ".tree2.xml";
	// input and output for MiniCCICGen
	public static String MINICC_ICGEN_INPUT_EXT = ".tree2.xml";
	public static String MINICC_ICGEN_OUTPUT_EXT = ".ic.txt";
	// input and output for MiniCCOpt
	public static String MINICC_OPT_INPUT_EXT = ".ic.xml";
	public static String MINICC_OPT_OUTPUT_EXT = ".ic2.xml";
	// input and output for MiniCCCodeGen
	public static String MINICC_CODEGEN_INPUT_EXT = ".ic2.xml";
	public static String MINICC_CODEGEN_OUTPUT_EXT = ".code.asm";
	// input and output for simulator
	public static String MINICC_ASSEMBLER_INPUT_EXT = ".code.asm";
	
	//structure for config.xml
	public String type;
	public String path;
	public String skip;
	public String target;
	public String ra;
	public String headless;
}
