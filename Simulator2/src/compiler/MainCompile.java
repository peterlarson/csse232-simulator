package compiler;

public class MainCompile {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Assembler as1 = new Assembler("src/compiler/ByteSourceCode.txt",2,0);
		as1.run("src/compiler/assemblyfile1");
		String[] s=as1.getAssemblerSet();
		System.out.print("");
	}
}