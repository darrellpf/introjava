package stacklinked;

interface StackInterface<E> extends Iterable<E> {
	public void		push	(E what);
	public E		pop		();
	public E		peek	();
	public boolean	isEmpty	();
	public int		size	();
}