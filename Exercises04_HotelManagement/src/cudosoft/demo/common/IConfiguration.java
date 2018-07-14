package cudosoft.demo.common;

public interface IConfiguration {
	// This is properties of Room
	public static final int MENU_EXIT = 0;
	public static final int MENU_ROOM = 1;
	public static final int MENU_ADD_ROOM = 11;
	public static final int MENU_EDIT_ROOM = 12;
	public static final int MENU_ROOM_IS_EMPTY = 13;
	public static final int MENU_ROOM_IS_NOT_EMPTY = 14;
	public static final int MENU_ROOM_ALL = 15;
	public static final int MENU_DELETE_ROOM = 16;
	public static final String ROOM_TYPE_VIP = "VIP";
	public static final String ROOM_TYPE_NORMAL = "Normal";
	public static final int ROOM_DISCOUNT_VIP = 5;
	public static final int ROOM_DISCOUNT_NORMAL = 10;
	public static final String ROOM_STATUS_AVAILABLE = "Available";
	public static final String ROOM_STATUS_BUSY = "Busy";

	// This is properties of Transaction
	public static final int MENU_TRANSACTION = 2;
	public static final int MENU_CHECKIN = 21;
	public static final int MENU_CHECKOUT = 22;
	public static final int MENU_SWITCH_ROOM = 23;

	// This is properties of Customer
	public static final int MENU_CUSTOMER = 3;
	public static final int MENU_ADD_CUSTOMER = 31;
	public static final int MENU_EDIT_CUSTOMER = 32;
	public static final int MENU_DELETE_CUSTOMER = 33;
	
	// This is confirm value
	public static final String CONFIRM_VALUE = "N";
	
	// This is reset value
	public static final int RESET_VALUE = 0;

}
