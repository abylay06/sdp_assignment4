public class ProgrammingLanguageFacade {
    private IPart lexer = new Lexer();
    private IPart passer = new  Passer();
    private IPart semanticAnalyzer = new SemanticAnalyzer();
    private IPart optimizer = new Optimizer();
    private IPart codeGenerator = new CodeGenerator();

    public void compile(){
        System.out.println("Compilation starts");
        lexer.work();
        passer.work();
        semanticAnalyzer.work();
        optimizer.work();
        codeGenerator.work();
        System.out.println("Compilation ends");
    }
}