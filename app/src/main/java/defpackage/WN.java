package defpackage;

import android.util.Log;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public final class WN implements Continuation {
    public final Object a;

    public WN(H2 h2, RecaptchaAction recaptchaAction) {
        this.a = recaptchaAction;
        Objects.requireNonNull(h2);
    }

    public static void a(C0399Wm c0399Wm) {
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0399Wm.i("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        c0399Wm.i("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        c0399Wm.i("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
    }

    public static H7 b(C0399Wm c0399Wm) {
        HashMap map = new HashMap(2);
        map.put("work_spec_id", new C3156oI(1, "work_spec_id", "TEXT", null, true, 1));
        map.put("prerequisite_id", new C3156oI(2, "prerequisite_id", "TEXT", null, true, 1));
        HashSet hashSet = new HashSet(2);
        hashSet.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        hashSet.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new C3320rI(Arrays.asList("work_spec_id"), "index_Dependency_work_spec_id", false));
        hashSet2.add(new C3320rI(Arrays.asList("prerequisite_id"), "index_Dependency_prerequisite_id", false));
        C3374sI c3374sI = new C3374sI("Dependency", map, hashSet, hashSet2);
        C3374sI c3374sIA = C3374sI.a(c0399Wm, "Dependency");
        if (!c3374sI.equals(c3374sIA)) {
            return new H7(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + c3374sI + "\n Found:\n" + c3374sIA);
        }
        HashMap map2 = new HashMap(25);
        map2.put(FacebookMediationAdapter.KEY_ID, new C3156oI(1, FacebookMediationAdapter.KEY_ID, "TEXT", null, true, 1));
        map2.put("state", new C3156oI(0, "state", "INTEGER", null, true, 1));
        map2.put("worker_class_name", new C3156oI(0, "worker_class_name", "TEXT", null, true, 1));
        map2.put("input_merger_class_name", new C3156oI(0, "input_merger_class_name", "TEXT", null, false, 1));
        map2.put("input", new C3156oI(0, "input", "BLOB", null, true, 1));
        map2.put("output", new C3156oI(0, "output", "BLOB", null, true, 1));
        map2.put("initial_delay", new C3156oI(0, "initial_delay", "INTEGER", null, true, 1));
        map2.put("interval_duration", new C3156oI(0, "interval_duration", "INTEGER", null, true, 1));
        map2.put("flex_duration", new C3156oI(0, "flex_duration", "INTEGER", null, true, 1));
        map2.put("run_attempt_count", new C3156oI(0, "run_attempt_count", "INTEGER", null, true, 1));
        map2.put("backoff_policy", new C3156oI(0, "backoff_policy", "INTEGER", null, true, 1));
        map2.put("backoff_delay_duration", new C3156oI(0, "backoff_delay_duration", "INTEGER", null, true, 1));
        map2.put("period_start_time", new C3156oI(0, "period_start_time", "INTEGER", null, true, 1));
        map2.put("minimum_retention_duration", new C3156oI(0, "minimum_retention_duration", "INTEGER", null, true, 1));
        map2.put("schedule_requested_at", new C3156oI(0, "schedule_requested_at", "INTEGER", null, true, 1));
        map2.put("run_in_foreground", new C3156oI(0, "run_in_foreground", "INTEGER", null, true, 1));
        map2.put("out_of_quota_policy", new C3156oI(0, "out_of_quota_policy", "INTEGER", null, true, 1));
        map2.put("required_network_type", new C3156oI(0, "required_network_type", "INTEGER", null, false, 1));
        map2.put("requires_charging", new C3156oI(0, "requires_charging", "INTEGER", null, true, 1));
        map2.put("requires_device_idle", new C3156oI(0, "requires_device_idle", "INTEGER", null, true, 1));
        map2.put("requires_battery_not_low", new C3156oI(0, "requires_battery_not_low", "INTEGER", null, true, 1));
        map2.put("requires_storage_not_low", new C3156oI(0, "requires_storage_not_low", "INTEGER", null, true, 1));
        map2.put("trigger_content_update_delay", new C3156oI(0, "trigger_content_update_delay", "INTEGER", null, true, 1));
        map2.put("trigger_max_content_delay", new C3156oI(0, "trigger_max_content_delay", "INTEGER", null, true, 1));
        map2.put("content_uri_triggers", new C3156oI(0, "content_uri_triggers", "BLOB", null, false, 1));
        HashSet hashSet3 = new HashSet(0);
        HashSet hashSet4 = new HashSet(2);
        hashSet4.add(new C3320rI(Arrays.asList("schedule_requested_at"), "index_WorkSpec_schedule_requested_at", false));
        hashSet4.add(new C3320rI(Arrays.asList("period_start_time"), "index_WorkSpec_period_start_time", false));
        C3374sI c3374sI2 = new C3374sI("WorkSpec", map2, hashSet3, hashSet4);
        C3374sI c3374sIA2 = C3374sI.a(c0399Wm, "WorkSpec");
        if (!c3374sI2.equals(c3374sIA2)) {
            return new H7(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + c3374sI2 + "\n Found:\n" + c3374sIA2);
        }
        HashMap map3 = new HashMap(2);
        map3.put("tag", new C3156oI(1, "tag", "TEXT", null, true, 1));
        map3.put("work_spec_id", new C3156oI(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet6 = new HashSet(1);
        hashSet6.add(new C3320rI(Arrays.asList("work_spec_id"), "index_WorkTag_work_spec_id", false));
        C3374sI c3374sI3 = new C3374sI("WorkTag", map3, hashSet5, hashSet6);
        C3374sI c3374sIA3 = C3374sI.a(c0399Wm, "WorkTag");
        if (!c3374sI3.equals(c3374sIA3)) {
            return new H7(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + c3374sI3 + "\n Found:\n" + c3374sIA3);
        }
        HashMap map4 = new HashMap(2);
        map4.put("work_spec_id", new C3156oI(1, "work_spec_id", "TEXT", null, true, 1));
        map4.put("system_id", new C3156oI(0, "system_id", "INTEGER", null, true, 1));
        HashSet hashSet7 = new HashSet(1);
        hashSet7.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        C3374sI c3374sI4 = new C3374sI("SystemIdInfo", map4, hashSet7, new HashSet(0));
        C3374sI c3374sIA4 = C3374sI.a(c0399Wm, "SystemIdInfo");
        if (!c3374sI4.equals(c3374sIA4)) {
            return new H7(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + c3374sI4 + "\n Found:\n" + c3374sIA4);
        }
        HashMap map5 = new HashMap(2);
        map5.put(AppMeasurementSdk.ConditionalUserProperty.NAME, new C3156oI(1, AppMeasurementSdk.ConditionalUserProperty.NAME, "TEXT", null, true, 1));
        map5.put("work_spec_id", new C3156oI(2, "work_spec_id", "TEXT", null, true, 1));
        HashSet hashSet8 = new HashSet(1);
        hashSet8.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new C3320rI(Arrays.asList("work_spec_id"), "index_WorkName_work_spec_id", false));
        C3374sI c3374sI5 = new C3374sI("WorkName", map5, hashSet8, hashSet9);
        C3374sI c3374sIA5 = C3374sI.a(c0399Wm, "WorkName");
        if (!c3374sI5.equals(c3374sIA5)) {
            return new H7(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + c3374sI5 + "\n Found:\n" + c3374sIA5);
        }
        HashMap map6 = new HashMap(2);
        map6.put("work_spec_id", new C3156oI(1, "work_spec_id", "TEXT", null, true, 1));
        map6.put("progress", new C3156oI(0, "progress", "BLOB", null, true, 1));
        HashSet hashSet10 = new HashSet(1);
        hashSet10.add(new C3211pI("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(FacebookMediationAdapter.KEY_ID)));
        C3374sI c3374sI6 = new C3374sI("WorkProgress", map6, hashSet10, new HashSet(0));
        C3374sI c3374sIA6 = C3374sI.a(c0399Wm, "WorkProgress");
        if (!c3374sI6.equals(c3374sIA6)) {
            return new H7(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + c3374sI6 + "\n Found:\n" + c3374sIA6);
        }
        HashMap map7 = new HashMap(2);
        map7.put("key", new C3156oI(1, "key", "TEXT", null, true, 1));
        map7.put("long_value", new C3156oI(0, "long_value", "INTEGER", null, false, 1));
        C3374sI c3374sI7 = new C3374sI("Preference", map7, new HashSet(0), new HashSet(0));
        C3374sI c3374sIA7 = C3374sI.a(c0399Wm, "Preference");
        if (c3374sI7.equals(c3374sIA7)) {
            return new H7(true, (String) null);
        }
        return new H7(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + c3374sI7 + "\n Found:\n" + c3374sIA7);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public /* synthetic */ Object then(Task task) {
        if (task.isSuccessful()) {
            return ((RecaptchaTasksClient) task.getResult()).executeTask((RecaptchaAction) this.a);
        }
        Exception exc = (Exception) Preconditions.checkNotNull(task.getException());
        if (!(exc instanceof XP)) {
            return Tasks.forException(exc);
        }
        if (Log.isLoggable("RecaptchaHandler", 4)) {
            Log.i("RecaptchaHandler", "Ignoring error related to fetching recaptcha config - " + exc.getMessage());
        }
        return Tasks.forResult("");
    }

    public /* synthetic */ WN(Object obj) {
        this.a = obj;
    }
}
