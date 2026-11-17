import java.util.Map.Entry;

void main() {
	ArrayList<String> al = new ArrayList<>();

	al.add("UNO");
	al.add("DIOS");
	al.add("TRES");
	al.add("TRES");

	IO.println(al);

	al.addFirst("CERO");

	al.remove(4);

	al.set(2, "DOS");

	IO.println(al);

	IO.println(al.size());

	for (String dato : al) {
		IO.println(dato);
	}

	HashSet<String> hs = new HashSet<>();

	hs.add("UNO");
	hs.add("DIOS");
	hs.add("TRES");
	hs.add("TRES");

	IO.println(hs);

//	hs.addFirst("CERO");

	hs.remove("DIOS");

//	hs.set(2, "DOS");

	IO.println(hs);

	IO.println(hs.size());

	for (String dato : hs) {
		IO.println(dato);
	}

	HashMap<String, Integer> map = new HashMap<>();

	map.put("UNO", 1);
	map.put("DOS", 2);

	IO.println(map.get("DOS"));

	for (Entry<String, Integer> par : map.entrySet()) {
		IO.println(par.getKey() + ": " + par.getValue());
	}

	for (String clave : map.keySet()) {
		IO.println(clave + ": " + map.get(clave));
	}

	for (Integer valor : map.values()) {
		IO.println(valor);
	}
}