public class ejemploInterface2
{
    static void ManejoInstrumento(InstrumentoMusical f)
{
System.out.println(f.tipoInstrumento());
f.afinar();
f.tocar();
}
public static void main(String[] args)
{
InstrumentoMusical guitarra = new InstrumentoCuerda();
InstrumentoMusical trompeta = new InstrumentoViento();
//InstrumentoMusical im = new = InstrumentoMusical();

ManejoInstrumento(guitarra);
ManejoInstrumento(trompeta);

}
}