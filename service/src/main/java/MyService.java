import java.util.UUID;

public class MyService {
    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "MyService";
    private Db db = new Db(dbSetting);

    public MyEntity setMyEntity(MyEntity myEntity){
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public String getName() {
        return name;
    }

    public MyEntity getMyEntity(){
        return db.getMyEntity();
    }
}
