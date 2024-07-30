package used;

/**
 * Calclator実装クラス<br>
 * 加算を行う
 */
public class AddCalc implements Calclator{
	@Override
	public Integer calc(Integer x, Integer y) {
		return x + y;
	}
}
