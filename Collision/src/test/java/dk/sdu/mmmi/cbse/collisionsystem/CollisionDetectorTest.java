package dk.sdu.mmmi.cbse.collisionsystem;

import dk.sdu.mmmi.cbse.common.data.Entity;
import dk.sdu.mmmi.cbse.common.data.entityparts.PositionPart;

import junit.framework.TestCase;
import org.junit.jupiter.api.*;

@DisplayName("Test that colliding works")
class CollisionDetectorTest extends TestCase {
Entity entity1,entity2;
CollisionDetector collisionDetector;
    @BeforeEach
    @DisplayName("Runs before each test")
    public void setUp() {
        entity1=new Entity();
        entity2=new Entity();
        collisionDetector=new CollisionDetector();
        entity1.setRadius(2.1f);
        entity2.setRadius(2.1f);
    }
    @Test
    @DisplayName("Colliding does happen between tow entities")
    void collides() {
        entity1.add(new PositionPart(2.0f,2.f,3.0f));
        entity2.add(new PositionPart(4.0f,4.f,2.0f));
        boolean Collides =collisionDetector.collides(entity1,entity2);
        assertTrue(Collides);
    }
    @Test
    @DisplayName("Colliding does not happen between tow entities")
    void NotCollides() {
        entity1.add(new PositionPart(2.0f,2.f,3.0f));
        entity2.add(new PositionPart(7.0f,7.f,3.0f));
       boolean NotCollides =collisionDetector.collides(entity1,entity2);
        assertFalse(NotCollides);
        System.out.println(" ");

    }
    @AfterEach
    public void CountNumberOfTestCases(TestInfo testInfo){
        String name = testInfo.getDisplayName();
        System.out.printf("The name of test is: "+ name+"\n" +"And the number of test is: "+ this.countTestCases());

    }

}