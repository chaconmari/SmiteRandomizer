package smitegame.game.smiterandomizer;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Collections;

public class DBHandler extends SQLiteOpenHelper {

    private SQLiteDatabase db;
    private static final String dbName = "smitegame";
    private static final int DATABASE_VERSION = 1;

    private static final String tbGods = "gods";
    private static final String tbConquest = "conquest";
    private static final String tbUnion = "gcUnion";

    private static final String godsID = "idg";
    private static final String godsNames = "name";

    private static final String conquestID = "idc";
    private static final String conquestRoles = "role";

    private static final String U_godsID = "u_idg";
    private static final String U_conquestID = "u_idc";

    public DBHandler(Context context) {
        super(context, dbName, null, DATABASE_VERSION);
    }

    public String test;
    @Override
    public void onCreate(SQLiteDatabase db) {
        String query_tbGods = "CREATE TABLE " + tbGods
                + " (" + godsID + " INTEGER PRIMARY KEY, "
                + godsNames + " TEXT)";

        String query_tbConquest = "CREATE TABLE " + tbConquest
                + " (" + conquestID + " INTEGER PRIMARY KEY, "
                + conquestRoles + " TEXT)";

        String query_tbUnion = "CREATE TABLE " + tbUnion
                + " (" + U_godsID + " INTEGER, "
                + U_conquestID + " INTEGER)";

        db.execSQL(query_tbGods);
        db.execSQL(query_tbConquest);
        db.execSQL(query_tbUnion);

        insertGod(db, 1, "Achilles");
        insertGod(db, 2, "Agni");
        insertGod(db, 3, "Ah Muzen Cab");
        insertGod(db, 4, "Ah Puch");
        insertGod(db, 5, "Amaterasu");
        insertGod(db, 6, "Anhur");
        insertGod(db, 7, "Anubis");
        insertGod(db, 8, "Ao%20Kuang");
        insertGod(db, 9, "Aphrodite");
        insertGod(db, 10, "Apollo");
        insertGod(db, 11, "Arachne");
        insertGod(db, 12, "Ares");
        insertGod(db, 13, "Artemis");
        insertGod(db, 14, "Artio");
        insertGod(db, 15, "Athena");
        insertGod(db, 16, "Atlas");
        insertGod(db, 17, "Awilix");
        insertGod(db, 18, "Baba%20Yaga");
        insertGod(db, 19, "Bacchus");
        insertGod(db, 20, "Bakasura");
        insertGod(db, 21, "Baron%20Samedi");
        insertGod(db, 22, "Bastet");
        insertGod(db, 23, "Bellona");
        insertGod(db, 24, "Cabrakan");
        insertGod(db, 25, "Camazotz");
        insertGod(db, 26, "Cerberus");
        insertGod(db, 27, "Cernunnos");
        insertGod(db, 28, "Chaac");
        insertGod(db, 29, "Chang'e");
        insertGod(db, 30, "Charybdis");
        insertGod(db, 31, "Chernobog");
        insertGod(db, 32, "Chiron");
        insertGod(db, 33, "Chronos");
        insertGod(db, 34, "Cliodhna");
        insertGod(db, 35, "Cthulhu");
        insertGod(db, 36, "Cu%20Chulainn");
        insertGod(db, 37, "Cupid");
        insertGod(db, 38, "Da%20Ji");
        insertGod(db, 39, "Danzaburou");
        insertGod(db, 40, "Discordia");
        insertGod(db, 41, "Erlang Shen");
        insertGod(db, 42, "Eset");
        insertGod(db, 43, "Fafnir");
        insertGod(db, 44, "Fenrir");
        insertGod(db, 45, "Freya");
        insertGod(db, 46, "Ganesha");
        insertGod(db, 47, "Geb");
        insertGod(db, 48, "Gilgamesh");
        insertGod(db, 49, "Guan%20Yu");
        insertGod(db, 50, "Hachiman");
        insertGod(db, 51, "Hades");
        insertGod(db, 52, "He%20Bo");
        insertGod(db, 53, "Heimdallr");
        insertGod(db, 54, "Hel");
        insertGod(db, 55, "Hera");
        insertGod(db, 56, "Hercules");
        insertGod(db, 57, "Horus");
        insertGod(db, 58, "Hou%20Yi");
        insertGod(db, 59, "Hun%20Batz");
        insertGod(db, 60, "Izanami");
        insertGod(db, 61, "Janus");
        insertGod(db, 62, "Jing%20Wei");
        insertGod(db, 63, "Jormungandr");
        insertGod(db, 64, "Kali");
        insertGod(db, 65, "Khepri");
        insertGod(db, 66, "King%20Arthur");
        insertGod(db, 67, "Kukulkan");
        insertGod(db, 68, "Kumbhakarna");
        insertGod(db, 69, "Kuzenbo");
        insertGod(db, 70, "Lanecelot");
        insertGod(db, 71, "Loki");
        insertGod(db, 72, "Medusa");
        insertGod(db, 73, "Mercury");
        insertGod(db, 74, "Merlin");
        insertGod(db, 75, "Morgan%20Le%20Fay");
        insertGod(db, 76, "Mulan");
        insertGod(db, 77, "Ne%20Zha");
        insertGod(db, 78, "Neith");
        insertGod(db, 79, "Nemesis");
        insertGod(db, 80, "Nike");
        insertGod(db, 81, "Nox");
        insertGod(db, 82, "Nu%20Wa");
        insertGod(db, 83, "Odin");
        insertGod(db, 84, "Olorun");
        insertGod(db, 85, "Osiris");
        insertGod(db, 86, "Pele");
        insertGod(db, 87, "Persephone");
        insertGod(db, 88, "Poseidon");
        insertGod(db, 89, "Ra");
        insertGod(db, 90, "Raijin");
        insertGod(db, 91, "Rama");
        insertGod(db, 92, "Ratatoskr");
        insertGod(db, 93, "Ravana");
        insertGod(db, 94, "Scylla");
        insertGod(db, 95, "Serqet");
        insertGod(db, 96, "Set");
        insertGod(db, 97, "Shiva");
        insertGod(db, 98, "Skadi");
        insertGod(db, 99, "Sobek");
        insertGod(db, 100, "Sol");
        insertGod(db, 101, "Sun%20Wukong");
        insertGod(db, 102, "Susano");
        insertGod(db, 103, "Sylvanus");
        insertGod(db, 104, "Terra");
        insertGod(db, 105, "Thanatos");
        insertGod(db, 106, "The%20Morrigan");
        insertGod(db, 107, "Thor");
        insertGod(db, 108, "Thoth");
        insertGod(db, 109, "Tiamat");
        insertGod(db, 110, "Tsukuyomi");
        insertGod(db, 111, "Tyr");
        insertGod(db, 112, "Ullr");
        insertGod(db, 113, "Vamana");
        insertGod(db, 114, "Vulcan");
        insertGod(db, 115, "Xbalanque");
        insertGod(db, 116, "Xing%20Tian");
        insertGod(db, 117, "Yemoja");
        insertGod(db, 118, "Ymir");
        insertGod(db, 119, "Zhong%20Qui");
        insertGod(db, 120, "Ishtar");
        insertGod(db, 121, "Maui");


        insertRole(db, 1, "Solo");
        insertRole(db, 2, "Jungle");
        insertRole(db, 3, "Mid");
        insertRole(db, 4, "Support");
        insertRole(db, 5, "Carry");

        insertUnion(db, 1, 1);
        insertUnion(db, 1, 2);
        insertUnion(db, 2, 3);
        insertUnion(db, 3, 5);
        insertUnion(db, 4, 3);
        insertUnion(db, 5, 1);
        insertUnion(db, 5, 2);
        insertUnion(db, 6, 5);
        insertUnion(db, 7, 3);
        insertUnion(db, 8, 2);
        insertUnion(db, 9, 4);
        insertUnion(db, 10, 5);
        insertUnion(db, 11, 2);
        insertUnion(db, 12, 4);
        insertUnion(db, 13, 5);
        insertUnion(db, 14, 4);
        insertUnion(db, 14, 1);
        insertUnion(db, 15, 4);
        insertUnion(db, 16, 4);
        insertUnion(db, 17, 2);
        insertUnion(db, 18, 3);
        insertUnion(db, 19, 4);
        insertUnion(db, 20, 2);
        insertUnion(db, 21, 3);
        insertUnion(db, 22, 2);
        insertUnion(db, 22, 1);
        insertUnion(db, 23, 2);
        insertUnion(db, 23, 1);
        insertUnion(db, 24, 2);
        insertUnion(db, 24, 4);
        insertUnion(db, 25, 2);
        insertUnion(db, 26, 1);
        insertUnion(db, 27, 5);
        insertUnion(db, 28, 1);
        insertUnion(db, 28, 2);
        insertUnion(db, 29, 3);
        insertUnion(db, 30, 5);
        insertUnion(db, 31, 5);
        insertUnion(db, 32, 5);
        insertUnion(db, 33, 3);
        insertUnion(db, 34, 2);
        insertUnion(db, 35, 4);
        insertUnion(db, 35, 1);
        insertUnion(db, 36, 2);
        insertUnion(db, 36, 1);
        insertUnion(db, 37, 5);
        insertUnion(db, 38, 2);
        insertUnion(db, 39, 5);
        insertUnion(db, 40, 3);
        insertUnion(db, 41, 2);
        insertUnion(db, 41, 1);
        insertUnion(db, 42, 3);
        insertUnion(db, 42, 1);
        insertUnion(db, 42, 4);
        insertUnion(db, 43, 4);
        insertUnion(db, 44, 2);
        insertUnion(db, 44, 1);
        insertUnion(db, 44, 4);
        insertUnion(db, 45, 5);
        insertUnion(db, 46, 4);
        insertUnion(db, 47, 4);
        insertUnion(db, 48, 2);
        insertUnion(db, 48, 1);
        insertUnion(db, 49, 1);
        insertUnion(db, 50, 5);
        insertUnion(db, 51, 3);
        insertUnion(db, 52, 3);
        insertUnion(db, 53, 5);
        insertUnion(db, 54, 3);
        insertUnion(db, 54, 4);
        insertUnion(db, 55, 3);
        insertUnion(db, 56, 1);
        insertUnion(db, 57, 2);
        insertUnion(db, 57, 1);
        insertUnion(db, 57, 4);
        insertUnion(db, 58, 5);
        insertUnion(db, 59, 2);
        insertUnion(db, 60, 5);
        insertUnion(db, 61, 3);
        insertUnion(db, 62, 5);
        insertUnion(db, 63, 1);
        insertUnion(db, 64, 2);
        insertUnion(db, 65, 4);
        insertUnion(db, 66, 1);
        insertUnion(db, 67, 3);
        insertUnion(db, 68, 4);
        insertUnion(db, 69, 4);
        insertUnion(db, 69, 1);
        insertUnion(db, 70, 2);
        insertUnion(db, 70, 1);
        insertUnion(db, 71, 2);
        insertUnion(db, 72, 5);
        insertUnion(db, 73, 2);
        insertUnion(db, 74, 3);
        insertUnion(db, 75, 3);
        insertUnion(db, 76, 2);
        insertUnion(db, 76, 1);
        insertUnion(db, 77, 2);
        insertUnion(db, 78, 5);
        insertUnion(db, 79, 2);
        insertUnion(db, 80, 2);
        insertUnion(db, 80, 1);
        insertUnion(db, 81, 3);
        insertUnion(db, 81, 4);
        insertUnion(db, 82, 3);
        insertUnion(db, 83, 2);
        insertUnion(db, 83, 1);
        insertUnion(db, 84, 5);
        insertUnion(db, 85, 2);
        insertUnion(db, 85, 1);
        insertUnion(db, 86, 2);
        insertUnion(db, 87, 3);
        insertUnion(db, 88, 3);
        insertUnion(db, 89, 3);
        insertUnion(db, 90, 3);
        insertUnion(db, 91, 5);
        insertUnion(db, 92, 2);
        insertUnion(db, 93, 2);
        insertUnion(db, 94, 3);
        insertUnion(db, 95, 2);
        insertUnion(db, 96, 2);
        insertUnion(db, 97, 1);
        insertUnion(db, 98, 5);
        insertUnion(db, 99, 4);
        insertUnion(db, 100, 5);
        insertUnion(db, 101, 2);
        insertUnion(db, 101, 1);
        insertUnion(db, 102, 2);
        insertUnion(db, 103, 1);
        insertUnion(db, 103, 4);
        insertUnion(db, 104, 1);
        insertUnion(db, 104, 4);
        insertUnion(db, 105, 2);
        insertUnion(db, 106, 3);
        insertUnion(db, 107, 2);
        insertUnion(db, 108, 3);
        insertUnion(db, 109, 3);
        insertUnion(db, 110, 2);
        insertUnion(db, 111, 1);
        insertUnion(db, 112, 3);
        insertUnion(db, 113, 1);
        insertUnion(db, 114, 3);
        insertUnion(db, 115, 5);
        insertUnion(db, 116, 4);
        insertUnion(db, 117, 4);
        insertUnion(db, 118, 4);
        insertUnion(db, 119, 1);
        insertUnion(db, 119, 3);
        insertUnion(db, 120, 5);
        insertUnion(db, 121, 4);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int t) {
        if (i != t) {
            this.db.execSQL("DROP TABLE IF EXISTS " + tbGods);
            this.db.execSQL("DROP TABLE IF EXISTS " + tbConquest);
            this.db.execSQL("DROP TABLE IF EXISTS " + tbUnion);
            onCreate(db);
        }
    }

    public void insertRole(SQLiteDatabase db, int i, String r){
        ContentValues c = new ContentValues();
        c.put(conquestRoles, r);
        c.put(conquestID, i);

        db.insert(tbConquest, null, c);
    }

    public void insertUnion(SQLiteDatabase db, int i, int r){
        ContentValues c = new ContentValues();
        c.put(U_godsID, i);
        c.put(U_conquestID, r);

        db.insert(tbUnion, null, c);
    }

    public void insertGod(SQLiteDatabase db, int i, String n){
        ContentValues c = new ContentValues();
        c.put(godsNames, n);
        c.put(godsID, i);;

        db.insert(tbGods, null, c);
    }

    public String getGod(int roleNum) {
        ArrayList<String> godList = getGodList(roleNum);
        Collections.shuffle(godList);

        return godList.get(2);
    }

    public String getAllGods(){
        ArrayList<String> godList = getAllGodsList();
        Collections.shuffle(godList);

        return godList.get(2);
    }
    public ArrayList<String> getAllGodsList(){
        ArrayList<String> gList = new ArrayList<>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query_godList = "SELECT gods.name FROM gods";
        Cursor c = db.rawQuery(query_godList, null);
        c.moveToFirst();
        String addg= c.getString(0);
        gList.add(addg);
        while(c.moveToNext()){
            addg=c.getString(0);
            gList.add(addg);
        }
        return gList;
    }

    public ArrayList<String> getGodList(int rN){
        ArrayList<String> gList = new ArrayList<String>();
        SQLiteDatabase db = this.getReadableDatabase();
        String query_godList = "SELECT gods.name FROM gods JOIN gcUnion " +
                "ON gods.idg = gcUnion.u_idg WHERE gcUnion.u_idc = " + rN;
        Cursor c = db.rawQuery(query_godList, null);
        c.moveToFirst();
        String addg= c.getString(0);
        gList.add(addg);
        while(c.moveToNext()){
            addg=c.getString(0);
            gList.add(addg);
        }
        return gList;
    }
}
