import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;

/**
 * Created by Peter on 2/16/2019.
 */
@SpireInitializer
public class Alchemist {

	public static final String ATTACK_GROSS = "512/bg_attack_gross-green.png";
	public static final String SKILL_GROSS = "512/bg_attack_gross-green.png";
	public static final String POWER_GROSS = "512/bg_attack_gross-green.png";


	public Alchemist(){

	}

	public static void initialize(){
		new Alchemist();
	}
}
