package used;

/**
 * Calclator実装クラス<br>
 * 減算を行う 
 */
public class SubCalc implements Calclator {
	@Override
	public Integer calc(Integer x, Integer y) {
		return x - y;
	}
}
