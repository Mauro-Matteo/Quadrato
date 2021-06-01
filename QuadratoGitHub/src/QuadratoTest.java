import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuadratoTest {

	@Test
	void TestQuadrato() {
		Quadrato q1=new Quadrato(2);
		float risAttesoPerimetro=(float) 8;
		float risOttenuto2=q1.Perimetro();
		assertEquals(risAttesoPerimetro,risOttenuto2, 0.01);
	}

	@Test
	void TestQuadrato2() {
		Quadrato q1=new Quadrato(4);
		float risAttesoArea= (float)16;
		float risOttenuto=q1.area();
		assertEquals(risAttesoArea, risOttenuto, 0.05);
	}

}
