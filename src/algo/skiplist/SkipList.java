package algo.skiplist;

import java.util.Random;

/**
 * �����һ��ʵ�ַ�����
 * �����д洢���������������Ҵ洢���ǲ��ظ��ġ�
 *
 */
public class SkipList {

	public SkipListEntry head;
	public SkipListEntry tail;
	
	public int n;
	public int h;
	
	public Random r;
	
	public SkipList() {
		SkipListEntry p1, p2;
		
		p1 = new SkipListEntry(SkipListEntry.negInf, null);
		p2 = new SkipListEntry(SkipListEntry.posInf, null);
		
		p1.right = p2;
		p2.left = p1;
		
		head = p1;
		tail = p2;
		
		n = 0;
		h = 0;
		r = new Random();
		
	}
	
	private SkipListEntry findEntry(String key) {
		
		SkipListEntry p;
		
		// ��headͷ�ڵ㿪ʼ����
		p = head;
		while(true) {
			// �������Ҳ��ң�ֱ���ҽڵ��keyֵ����Ҫ���ҵ�keyֵ
			while(p.right.key != SkipListEntry.posInf 
					&& p.right.key.compareTo(key) <= 0) {
				p = p.right;
			}
			
			// ����и��Ͳ�Ľڵ㣬����Ͳ��ƶ�
			if(p.down != null) {
				p = p.down;
			}else {
				break;
			}
		}
		
		// ����p����ע������p��keyֵ��С�ڵ��ڴ���key��ֵ�ģ�p.key <= key��
		return p;
	}
	
	public Integer get(String key) {
		
		SkipListEntry p;
		
		p = findEntry(key);
		
		if(p.key.equals(key)) {
			return p.value;
		}else {
			return null;
		}
	}
	
	public Integer put(String key, Integer value) {
		
		SkipListEntry p, q;
		int i = 0;
		
		// �����ʺϲ����λ��
		p = findEntry(key);
		
		// �����Ծ���д��ں���keyֵ�Ľڵ㣬�����value���޸Ĳ����������
		if(p.key.equals(key)) {
			Integer oldValue = p.value;
			p.value = value;
			return oldValue;
		}
		
		// �����Ծ���в����ں���keyֵ�Ľڵ㣬�������������
		q = new SkipListEntry(key, value);
		q.left = p;
		q.right = p.right;
		p.right.left = q;
		p.right = q;
		
		while(r.nextDouble() < 0.5) {
			
			if(i >= h) {
				// �����Ԫ�صļ����Ѿ��ﵽ��Ծ������߶ȣ����½��հײ�
				addEmptyLevel();
			}
			
			// ��p����ɨ�躬�и߲�ڵ�Ľڵ�
			while(p.up == null) {
				p = p.left;
			}
			
			p = p.up;
			
			// ������qָ��ָ��Ľڵ㺬����ͬkeyֵ�Ľڵ����
            // ������Ҫע����ǳ��ײ�ڵ�֮��Ľڵ�����ǲ���Ҫvalueֵ��
			SkipListEntry z = new SkipListEntry(key, null);
			
			z.right = p;
			z.left = p.right;
			
			p.right.left = z;
			p.right = z;

			z.down = q;
			q.up = z;
			
			q = z;
			i += 1;
		}
		n = n + 1;
		
		// ����null��û�оɽڵ��valueֵ
		return null;
	}
	
	private void addEmptyLevel() {
		SkipListEntry p1, p2;
		
		p1 = new SkipListEntry(SkipListEntry.negInf, null);
		p2 = new SkipListEntry(SkipListEntry.posInf, null);
		
		p1.left = p2;
		p2.right = p1;

		p1.down = head;
		p2.down = tail;
		
		head.up = p1;
		tail.up = p2;
		
		head = p1;
		tail = p2;
		
		h = h + 1;
	}
	
	public Integer remove(String key) {
		SkipListEntry p, q;
		
		p = findEntry(key);
		
		if(!p.key.equals(key)) {
			return null;
		}
		
		Integer oldValue = p.value;
		while(p != null) {
			q = p.up;
			
			p.left.right = p.right;
			p.right.left = p.left;
			p = q;
		}
		
		return oldValue;
	}

}
