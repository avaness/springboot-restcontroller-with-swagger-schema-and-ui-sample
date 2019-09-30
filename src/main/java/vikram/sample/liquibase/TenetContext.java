package vikram.sample.liquibase;

public class TenetContext {

	private static final ThreadLocal<Long> contextHolder = new ThreadLocal<>();

	public static void setTenantId(final Long tenantId) {
		contextHolder.set(tenantId);
	}

	public static Long getTenantId() {
		return contextHolder.get();
	}

	public static void clearTenant() {
		contextHolder.remove();
	}

}
