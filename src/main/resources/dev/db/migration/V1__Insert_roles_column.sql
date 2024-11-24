-- Insert cột description cho bảng roles
ALTER TABLE roles
    ADD COLUMN description VARCHAR(50) DEFAULT NULL;
