package vazkii.patchouli.client.book.template;

import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;

public final class JsonVariableWrapper implements IVariableProvider {

	private final JsonObject source;
	
	public JsonVariableWrapper(JsonObject source) {
		this.source = source;
	}
	
	@Override
	public String get(String key) {
        JsonPrimitive prim = (JsonPrimitive) source.get(key);
        return prim.getAsString();
	}
	
	@Override
	public boolean has(String key) {
		return source.has(key);
	}
	
}
